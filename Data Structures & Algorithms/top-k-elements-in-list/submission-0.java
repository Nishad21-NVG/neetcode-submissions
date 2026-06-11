class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>count = new HashMap<>();
        for(int n : nums)
        {
            count.put(n, count.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int i = 0; i < bucket.length; i++)
        {
            bucket[i] = new ArrayList<>();
        }
        for(int n : count.keySet())
        {
            int freq = count.get(n);
            bucket[freq].add(n);
        }
        int [] res = new int[k];
        int idx = 0;
        for(int i = bucket.length - 1; i >= 0 && idx < k; i--)
        {
            for(int num : bucket[i])
            {
                res[idx++] = num;
                if(idx == k)
                {
                    break;
                }
            }
        }
        return res;
    }
}