package leetcode.utils;

public class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
	}

	// ����ת��������
	public static ListNode arrayToListNode(int[] s) {
		ListNode root = new ListNode(s[0]);// ��������ĸ��ڵ㣬��������ĵ�һ��Ԫ�ص�ֵ��������ĸ��ڵ�
		ListNode other = root;// ������һ���ڵ㣬����otherָ��root�ڵ㣬other�ڴ���Ϊһ����ʱ�������൱��ָ��
		for (int i = 1; i < s.length; i++) {// �����Ѹ�root��ֵ������i��1��ʼ
			ListNode temp = new ListNode(s[i]);// ÿѭ��һ������һ���µĽڵ�,������ǰ�ڵ㸳ֵ
			other.next = temp;// ��other����һ���ڵ�ָ�����ɵ��µĽڵ�
			other = temp;// ��otherָ�����һ���ڵ�(other����һ���ڵ�) other=other.getNext();
		}
		return root;
	}

	public static void print(ListNode listNode) {
		while (listNode.next != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
}