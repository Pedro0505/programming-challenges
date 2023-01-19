function kidsWithCandies(candies: number[], extraCandies: number): boolean[] {
  const maxNum = Math.max(...candies);

  return candies.map((e) => {
    if ((e + extraCandies) >= maxNum) {
      return true
    }

    return false
  });
};
