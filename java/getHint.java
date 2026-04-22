class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> freq = new HashMap();
        int A = 0;
        int B = 0;

        for (int i = 0; i < secret.length(); i++) {
            Character currentChar = secret.charAt(i);

            if (currentChar == guess.charAt(i)) {
                A++;
            } else {
                if (freq.containsKey(currentChar)) {
                    int count = freq.get(currentChar);
                    freq.put(currentChar, count + 1);
                } else {
                    freq.put(currentChar, 1);
                }
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) != secret.charAt(i)) {
                Character currentChar = guess.charAt(i);

                // check if char exist
                boolean charExist = freq.containsKey(currentChar);
                
                if (charExist) {
                    B++;
                    int count = freq.get(currentChar);

                    if (count == 1) {
                        freq.remove(currentChar);
                    } else {
                        freq.put(currentChar, count - 1);
                    }
                }
            }
        }

        return A + "A" + B + "B";
    }
}