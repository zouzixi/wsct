package cn.wsct.util;

import java.util.ArrayList;
import java.util.List;

import cn.wsct.pojo.ShopMenu;

public class RandomValue {

	// 从List中随机出count个对象  
	public static List randomTopic(List list, int count) {  
	    // 创建一个长度为count(count<=list)的数组,用于存随机数  
	    int[] a = new int[count];  
	    // 利于此数组产生随机数  
	    int[] b = new int[list.size()];  
	    int size = list.size();  
	  
	    // 取样填充至数组a满  
	    for (int i = 0; i < count; i++) {  
	        int num = (int) (Math.random() * size); // [0,size)  
	        int where = -1;  
	        for (int j = 0; j < b.length; j++) {  
	            if (b[j] != -1) {  
	                where++;  
	                if (where == num) {  
	                    b[j] = -1;  
	                    a[i] = j;  
	                }  
	            }  
	        }  
	        size = size - 1;  
	    }  
	    // a填满后 将数据加载到rslist  
	    List rslist = new ArrayList<ShopMenu>();  
	    for (int i = 0; i < count; i++) {  
	    	Object df = list.get(a[i]);  
	        rslist.add(df);  
	    }  
	    return rslist;  
	}  
	
}
