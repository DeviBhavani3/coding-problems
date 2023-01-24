class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def size(root):
            if not root:
                return 0
            l=1+size(root.left)
            r=1+size(root.right)    
            return max(l,r)
        return size(root)           

