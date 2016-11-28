
int minBases(int sum, int power) {
	int max_base = (int) Math.floor(Math.pow(sum, (1.0/power)));

	int min = sum; //1^power + 1^power + .... = sum
	for (int base = 2; base <= max_base; base++) {
		int count = (int) Math.floor(sum/Math.pow(base, power));
		int rem = sum - (int) (count * (Math.pow(base, power)));
		if (rem > 0) count += minBases(rem, power);

		min = Math.min(min, count);
	}

	return min;
}