int lengthOfLongestSubstring(char *s) {
    int n = strlen(s);
    int result = 0;
    int i = 0, j = 0;
    int index[256]; 

    for (int k = 0; k < 256; k++) {
        index[k] = -1;
    }

    while (j < n) {
        if (index[s[j]] >= i) {
            i = index[s[j]] + 1;
        }
        index[s[j]] = j;
        result = result > (j - i + 1) ? result : (j - i + 1);
        j++;
    }

    return result;
}