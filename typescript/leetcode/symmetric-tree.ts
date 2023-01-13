class TreeNode {
    val: number
    left: TreeNode | null
    right: TreeNode | null
    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val===undefined ? 0 : val)
        this.left = (left===undefined ? null : left)
        this.right = (right===undefined ? null : right)
    }
}

function isSame(q: TreeNode | null, p: TreeNode | null) {
  if (!p && !q) {
      return true
  }

  if (p && q) {
      return p.val == q.val && isSame(p.left, q.right) && isSame(p.right, q.left)
  }

  return false
}

function isSymmetric(root: TreeNode | null): boolean {
  if (!root) {
    return false
  }

  return isSame(root.right, root.left)
};
