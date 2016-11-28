public boolean isPresent(Node root, int value) {
	if (root.value == value) return true;

	if (value > root.value && root.right != null) return isPresent(root.right, value);
	else if (value < root.value && root.left != null) return isPresent(root.left, value);
	else return false;

	// boolean right = (value > root.value && root.right != null) ? isPresent(root.right, value) : false;
	// boolean left = (value < root.value && root.left != null) ? isPresent(root.left, value) : false;
	// return (left || right);
  
}
