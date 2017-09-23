/* THIS IS A SOLUTION TO A PROGRAM IN LEETCODE
HERE'S THE LINK:	https://leetcode.com/problems/continuous-subarray-sum/description/
*/


public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==0)
            return false;
        else if(k<=0)
        {
            int t=0;
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]==0 && nums[i+1]==0){
                    t++;
                    break;
                }
            }
            if(t>0)
                return true;
            else {
                if(k!=0 && check(nums,k))
                    return true;
                else
                    return false;
            }
        }
        else{
        boolean isfound=false;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum%k==0 && j-i>=1)
                {
                    isfound=true;
                    break;
                }
            }
        }
        
        return isfound;
        }
        
    }
    
    public boolean check(int nums[],int k)
    {
        boolean isfound=false;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum%k==0 && j-i>=1)
                {
                    isfound=true;
                    break;
                }
            }
        }
        return isfound;
    }
