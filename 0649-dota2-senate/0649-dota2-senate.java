class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> radiant = new LinkedList<>();
        Deque<Integer> dire = new LinkedList<>();
        
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            if (radiant.peekFirst() < dire.peekFirst()) {
                dire.pollFirst();
                radiant.add(radiant.pollFirst() + senate.length());
            } else {
                radiant.pollFirst();
                dire.add(dire.pollFirst() + senate.length());
            }
        }
        
        return radiant.isEmpty()? "Dire" : "Radiant";
    }
}