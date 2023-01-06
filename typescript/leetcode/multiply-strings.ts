// https://leetcode.com/problems/multiply-strings/submissions/872242196/

function multiply(num1: string, num2: string): string {
  return String(BigInt(num1) * BigInt(num2));
};
