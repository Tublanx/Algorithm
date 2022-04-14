import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {

	char root;
	Node left;
	Node right;

	public Node(char root) {
		this.root = root;
	}

}

class Tree {

	Node node;

	void initNode(char root, char left, char right) {
		if (node == null) {
			node = new Node(root);

			node.left = (left == '.' ? null : new Node(left));
			node.right = (right == '.' ? null : new Node(right));
		} else {
			searchNode(node, root, left, right);
		}
	}

	void searchNode(Node node, char root, char left, char right) {
		if (node == null)
			return;
		else if (node.root == root) {
			node.left = (left == '.' ? null : new Node(left));
			node.right = (right == '.' ? null : new Node(right));
		} else {
			searchNode(node.left, root, left, right);
			searchNode(node.right, root, left, right);
		}
	}

	void preorderTraversal(Node node) {
		if (node != null) {
			System.out.print(node.root);
			if (node.left != null) {
				preorderTraversal(node.left);
			}
			if (node.right != null) {
				preorderTraversal(node.right);
			}
		}
	}

	void inorderTraversal(Node node) {
		if (node != null) {
			if (node.left != null) {
				inorderTraversal(node.left);
			}
			System.out.print(node.root);
			if (node.right != null) {
				inorderTraversal(node.right);
			}
		}
	}

	void postorderTraversal(Node node) {
		if (node != null) {
			if (node.left != null) {
				postorderTraversal(node.left);
			}
			if (node.right != null) {
				postorderTraversal(node.right);
			}
			System.out.print(node.root);
		}
	}

}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Tree t = new Tree();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			char root = st.nextToken().charAt(0);
			char leftNode = st.nextToken().charAt(0);
			char rightNode = st.nextToken().charAt(0);

			t.initNode(root, leftNode, rightNode);
		}

		t.preorderTraversal(t.node);
		System.out.println();
		t.inorderTraversal(t.node);
		System.out.println();
		t.postorderTraversal(t.node);
	}

}
