package testLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class TestDesignTwitter {
	public static class Tweet {
		private int id;
		private int timestamp;
		private Tweet next;

		public Tweet(int id, int timestamp) {
			this.id = id;
			this.timestamp = timestamp;
		}
	}

	public static class Twitter {
		// �û�Id������
		private static HashMap<Integer, Tweet> twitter;

		// �û�Id�͹�ע��Id�б�
		private static HashMap<Integer, Set<Integer>> followings;

		// �ϲ�ǰʮ���ҵ����µ�10������
		private static PriorityQueue<Tweet> priorityQueue;

		// ʱ���
		private static int timestamp;

		public Twitter() {
			twitter = new HashMap<>();
			followings = new HashMap<>();
			// o1-o2Ĭ������lamda���ʽ��o2-o1����
			priorityQueue = new PriorityQueue<>((o1, o2) -> -o1.timestamp + o2.timestamp);
		}

		public void postTweet(int userId, int tweetId) {
			timestamp++;
			if (twitter.containsKey(userId)) {
				// ���õ��û��ɵ�����
				Tweet oldTweet = twitter.get(userId);
				Tweet newTweet = new Tweet(userId, timestamp);
				// �µ�������ǰ���ɵ��ں�
				newTweet.next = oldTweet;
				twitter.put(userId, newTweet);
			} else {
				twitter.put(userId, new Tweet(userId, timestamp));
			}
		}

		public List<Integer> getNewsFeed(int userId) {
			priorityQueue.clear();
			// �Լ�����ҲҪ����
			if (twitter.containsKey(userId)) {
				priorityQueue.offer(twitter.get(userId));
			}
			// ��ע�ߵ��б�
			Set<Integer> followingList = followings.get(userId);
			if (followingList != null && followingList.size() > 0) {
				for (Integer following : followingList) {
					Tweet tweet = twitter.get(following);
					if (tweet != null) {
						priorityQueue.offer(tweet);
					}
				}
			}
			List<Integer> list = new ArrayList<>(10);
			int count = 0;
			while (!priorityQueue.isEmpty() && count < 10) {
				Tweet tweet = priorityQueue.poll();
				list.add(tweet.id);
				if (tweet.next != null) {
					priorityQueue.offer(tweet.next);
				}
				count++;
			}
			return list;
		}

		/**
		 * @param followerId �����ע��ID
		 * @param followeeId ����ע��ID
		 */
		public void follow(int followerId, int followeeId) {
			if (followerId == followeeId) {
				return;
			}
			Set<Integer> followList = followings.get(followerId);
			if (followList == null) {
				Set<Integer> follow = new HashSet<>();
				follow.add(followeeId);
				followings.put(followerId, follow);
			} else {
				if (followList.contains(followeeId)) {
					return;
				}
				followList.add(followeeId);
			}
		}

		public void unfollow(int followerId, int followeedId) {
			if (followerId == followeedId) {
				return;
			}
			Set<Integer> set = followings.get(followerId);
			if (set == null) {
				return;
			}
			set.remove(followeedId);
		}
	}

	public static void main(String[] args) {
		Twitter twitter = new Twitter();
		twitter.postTweet(1, 1);
		List<Integer> res1 = twitter.getNewsFeed(1);
		System.out.println(res1);

		twitter.follow(2, 1);

		List<Integer> res2 = twitter.getNewsFeed(2);
		System.out.println(res2);

		twitter.unfollow(2, 1);

		List<Integer> res3 = twitter.getNewsFeed(2);
		System.out.println(res3);
	}
}
