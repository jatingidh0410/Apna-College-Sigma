package DS.LeetCodeProblems;

public class Trapping_Rain_Water_42 {
    public int trap(int[] height) {
        int n = height.length;

        int pMax[] =  new int[n];
        int sMax[] = new int[n];

        pMax[0] = height[0];
        for(int i=1;i<n;i++){
            pMax[i] = Math.max(pMax[i-1],height[i]);
        }
        sMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            sMax[i] = Math.max(sMax[i+1],height[i]);
        }

        int ans=0;
        for( int i=0;i<n;i++)
        {
             int water = Math.min( pMax[i], sMax[i]) - height[i]; //min(9,10)-2 =7
 
             ans+= water;
        }
        return ans;

    }

}

/*
📘 Explanation — Trapping Rain Water Problem

💡 Idea:
For each bar, the water trapped above it depends on the 
tallest bars to its left and right.

We precompute:
1️⃣ pMax[i] → highest bar from the start to index i  (prefix max)
2️⃣ sMax[i] → highest bar from the end to index i    (suffix max)

Then, at each index:
   water trapped = min(pMax[i], sMax[i]) - height[i]

💧 If both sides are taller than height[i], water is trapped.
💧 If either side is lower, no water is trapped there.

🧮 Steps:
1. Build prefix max array → left-to-right.
2. Build suffix max array → right-to-left.
3. Traverse once more to calculate total trapped water.

⏱️ Time Complexity: O(n)
💾 Space Complexity: O(n)
*/
