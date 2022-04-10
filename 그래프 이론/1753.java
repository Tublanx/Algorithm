package 알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	final static int INF = 10000000;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int V = sc.nextInt();
		int E = sc.nextInt();
		int start = sc.nextInt();

		ArrayList<Element>[] adjList = new ArrayList[V + 1];
		for (int i = 1; i < V + 1; i++) {
			adjList[i] = new ArrayList<Element>();
		}

		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();

			adjList[u].add(new Element(v, w));
		}

		boolean[] chk = new boolean[V + 1];
		int[] dis = new int[V + 1];
		Arrays.fill(dis, INF);
		dis[start] = 0;

		PriorityQueue<Element> que = new PriorityQueue<Element>();
		que.offer(new Element(start, 0));

		while (!que.isEmpty()) {
			int cur = que.poll().idx;

			if (chk[cur])
				continue;
			chk[cur] = true;

			for (Element next : adjList[cur]) {
				if (dis[next.idx] > dis[cur] + next.dis) {
					dis[next.idx] = dis[cur] + next.dis;
					que.offer(new Element(next.idx, dis[next.idx]));
				}
			}
		}

		for (int i = 1; i < V + 1; i++) {
			if (dis[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(dis[i]);
			}
		}
	}
}

class Element implements Comparable<Element> {
	int idx, dis;

	public Element(int idx, int dis) {
		this.idx = idx;
		this.dis = dis;
	}

	@Override
	public int compareTo(Element o) {
		return Integer.compare(this.dis, o.dis);
	}
}
