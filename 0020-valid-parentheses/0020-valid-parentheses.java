class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack <Character>();
          char [] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('|| arr[i]=='['|| arr[i]=='{'){
                stack.push(arr[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top= stack.peek();
                if(arr[i]==')'&& top=='('|| arr[i]==']'&& top=='['|| arr[i]=='}' && top=='{'){
                  stack.pop();  
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}