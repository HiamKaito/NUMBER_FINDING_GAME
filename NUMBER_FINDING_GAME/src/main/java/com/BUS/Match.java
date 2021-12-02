package com.BUS;

import com.DTO.NumberPoint;

import java.util.Stack;

import static java.sql.Types.NULL;

public class Match {
    private String strIdRoom;
    private String strRoomName;
    private long longMatchTime;

    private Map map;
    private Stack<Integer> stacks;

    public Match() {
    }

    /**
     * Create new map random, if it not exists
     * @param startValue giá trị bắt đẩu
     * @param endValue   giá trị kết thúc
     */
    public void createRandomMap(int startValue, int endValue) {
//        check is NULL
        if (map == null ) {
            map = new Map();
        }
        if (stacks == null) {
            stacks = new Stack<>();
        }

//        Check input value
        if (startValue != NULL || endValue != NULL) {
            map.setStartValue(startValue);
            map.setEndValue(endValue);
        } else {
            map.setStartValue(1);
            map.setEndValue(100);
        }

        map.createNew(770, 0, 470, 0);

//        Put in to stack
        for (NumberPoint DTO : map.getList()) {
            stacks.push(DTO.getIntValue());
        }
    }

    public void createRandomMap() {
        createRandomMap(NULL, NULL);
    }

    /**
     * @return Next value for choice
     */
    public int getNextValue() {
        return stacks.pop();
    }








    public String getStrIdRoom() {
        return strIdRoom;
    }

    public void setStrIdRoom(String strIdRoom) {
        this.strIdRoom = strIdRoom;
    }

    public String getStrRoomName() {
        return strRoomName;
    }

    public void setStrRoomName(String strRoomName) {
        this.strRoomName = strRoomName;
    }

    public long getLongMatchTime() {
        return longMatchTime;
    }

    public void setLongMatchTime(long longMatchTime) {
        this.longMatchTime = longMatchTime;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Stack<Integer> getStacks() {
        return stacks;
    }

    public void setStacks(Stack<Integer> stacks) {
        this.stacks = stacks;
    }
}
