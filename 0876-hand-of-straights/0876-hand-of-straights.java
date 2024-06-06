class Solution {
  public boolean isNStraightHand(int[] hand, int groupSize) {
    if (hand.length % groupSize != 0) {
      return false; // Hand size not divisible by group size
    }

    // Sort the hand to group consecutive cards together
    Arrays.sort(hand);

    // Use a HashMap to track the frequency of each card value
    HashMap<Integer, Integer> cardCounts = new HashMap<>();
    for (int card : hand) {
      cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
    }

    // Iterate through the sorted hand
    for (int card : hand) {
      int count = cardCounts.get(card);
      if (count > 0) {  // If the card exists and has remaining count

        // Remove the card and its consecutive higher cards from the map
        for (int i = 0; i < groupSize; i++) {
          int expectedCard = card + i;
          if (!cardCounts.containsKey(expectedCard) || cardCounts.get(expectedCard) == 0) {
            return false; // Missing consecutive card or no remaining count
          }
          cardCounts.put(expectedCard, cardCounts.get(expectedCard) - 1);
        }
      }
    }

    return true; // All cards were placed in valid groups
  }
}
