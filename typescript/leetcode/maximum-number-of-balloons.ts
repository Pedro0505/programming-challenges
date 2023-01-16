const removeBallonChar = (map: Map<string, number>) => {
  ['b', 'a', 'l', 'l', 'o', 'o', 'n'].forEach((e) => {
    const value = map.get(e) as number;
    map.set(e, value - 1);
  });
}

function maxNumberOfBalloons(text: string): number {
  const replaced = text.toLowerCase().replace(/[^b|a|l|o|n]/g, '');

  if (replaced.length < 6) {
    return 0
  }

  const splited = replaced.split('');

  const map = new Map<string, number>()

  for (let i = 0; i < splited.length; i += 1) {
    const cur = splited[i];
    if (map.has(cur)) {
      const value = map.get(cur) as number;

      map.set(cur, value + 1)
    } else {
      map.set(cur, 1)
    }
  }

  let ans = 0
  
  for (let i = 0; i < Math.ceil(splited.length / 7); i++) {
    let b = map.get('b'), a = map.get('a'), l = map.get('l'), o = map.get('o'), n = map.get('n');

    if (!b || !a || !l || !o || !n || o < 2 || l < 2) {
      break;
    }

    ans += 1;

    removeBallonChar(map);
  }
    
  return ans;
};
