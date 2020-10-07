class Solution{
  public void idea(char[] s, int left, int right){
    if(left>=right) return;
    char temp = s[left];
    s[left++]=s[right];
    s[right--]= temp;
    idea(s, left, right);
}

public void reverseString(char[] s){
  idea(s, 0, s.length-1);
}
