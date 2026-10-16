using namespace std;
class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()){
            return false;
        }
        vector <int> a1(26),a2(26);
        for (int i=0; i<s.size();i++){
            a1[s[i]-'a']++;
            a2[t[i]-'a']++;
        }
        if(a1==a2){
            return true;
        }
        return false;
    }
};
