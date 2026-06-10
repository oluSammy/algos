class Solution {
    public int longestConsecutive(int[] nums) {
        // check array length and sequence difference

        Set<Integer> sequence = Arrays.stream(nums)
                                      .boxed()
                                      .collect(Collectors.toSet());

        int longestSequence = 0;

        for (int num : sequence) {
            System.out.println(num);
            int lowerNumber = num - 1;

            boolean isNotStartOfSequence = sequence.contains(lowerNumber);

            if (!isNotStartOfSequence) {
                int current = num;
                int currentSequence = 1;
                boolean contd = true;

                while(contd) {
                    int next = current + 1;
                    System.out.println(current);
                    if (sequence.contains(next)) {
                        currentSequence++;
                        current = next;
                    } else {
                        contd = false;
                    }
                }

                longestSequence = Math.max(longestSequence, currentSequence);
            }
        };

        return longestSequence;
     }
}