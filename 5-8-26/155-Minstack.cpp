class MinStack {
public:
vector<pair<int,int>> st;
    MinStack() {
        
    }
    
    void push(int value) {
        int mins=value;
        if(!st.empty()){
            mins=min(value,getMin());
        }
        st.push_back(make_pair(value,mins));
    }
    
    void pop() {
      return st.pop_back();
    }
    
    int top() {
        return st.back().first;
    }
    
    int getMin() {
        return st.back().second;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(value);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
