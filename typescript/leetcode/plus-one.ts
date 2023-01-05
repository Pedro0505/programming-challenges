function plusOne(digits: number[]): number[] {
  const nToStr = String((BigInt(digits.join(''))) + BigInt(1)).split('').map(Number);

  return nToStr;
};