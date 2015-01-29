package Q50;
import java.util.ArrayList;
import java.util.List;

//����͹������ڵ㣬��Ѱ�ҳ�����㵽����Ŀ�Ľڵ��·�������ٴӸ���㿪ʼ��������������һ�������ڵ������͹����ڵ�
import Q50.BinaryTreeNode;
public class mainclass3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static BinaryTreeNode solve(BinaryTreeNode root,BinaryTreeNode node1,BinaryTreeNode node2)
	{
		List<BinaryTreeNode> list1 = getPath(root,node1);
		List<BinaryTreeNode> list2 = getPath(root,node2);
		BinaryTreeNode temp = root;
		for(int i = 0;i<list1.size() && i< list2.size();i++)
		{
			if(list1.get(i) == list2.get(i)) 
			{
				temp = list1.get(i);
			}
			else break;
		}
		return temp;
	}
	
	
	public static List<BinaryTreeNode> getPath(BinaryTreeNode root,BinaryTreeNode node)
	{
		//���ش�root��node��·��,����
		List<BinaryTreeNode> list = new ArrayList<BinaryTreeNode>();
		list.add(root);
		if(root == node) return list;
		if(root.left!=null) return getPath(root.left,node);
		if(root.right!=null) return getPath(root.right,node);
		
		list.remove(list.size()-1);
		return null;
	}
}
