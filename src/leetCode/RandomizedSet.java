package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    @Override
    public String toString() {
        return "RandomizedSet{" +
                "value=" + location +
                ", checkId=" + data +
                '}';
    }

    public static Random rm = new Random();
    private HashMap<Integer,Integer> location;
    private ArrayList<Integer> data;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        location = new HashMap<>();
        data = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
        location.put(val, data.size());
        data.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!location.containsKey(val)){
            return false;
        }

        if(location.get(val) != data.size()-1){
            int loc = location.get(val);//location of val
            int tail = data.get(data.size()-1);//number of last
            //data.set(data.size()-1, data.get(loc));
            data.set(loc, tail);
            location.put(tail,loc);
        }

        location.remove(val);
        data.remove(data.size()-1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return data.get(rm.nextInt(data.size()));
    }

    public static void main(String[] args) {
        RandomizedSet r=new RandomizedSet();
        r.insert(1);
        r.remove(2);
        r.getRandom();
        r.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
        r.insert(2); // 2 was already in the set, so return false.
        r.getRandom();
        System.out.println(r);
    }

}
