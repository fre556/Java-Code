package BinaryTreePaths;

public class BinaryTreepath {
	
	public List<String>binaryTreePaths(TreeNode root){
		List<String> paths = new ArrayList<>();
		
		if(root == null) {
			return paths;
		}
		
		dfs(root, " ", paths);
		return paths
	}
	
	public void dfs(Treenode root , String paths, List<String> paths) {
		path = path + root.val;
		
		if (root.left != null) {
			dfs(root.left , path + "->" , paths);
		}
		
		if(root.right !=null) {
			dfs(root.right, path + "-> ", paths);
		}
				
	}
	

}
