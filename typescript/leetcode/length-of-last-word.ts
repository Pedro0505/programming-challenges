function lengthOfLastWord(s: string): number {
  const str = s.trim().replace(/\s{2}/gi, ' ').split(' ');

  return str[str.length - 1].length;
};
