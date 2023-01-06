// https://leetcode.com/problems/length-of-last-word/submissions/872142421/

function lengthOfLastWord(s: string): number {
  const str = s.trim().replace(/\s{2}/gi, ' ').split(' ');

  return str[str.length - 1].length;
};
