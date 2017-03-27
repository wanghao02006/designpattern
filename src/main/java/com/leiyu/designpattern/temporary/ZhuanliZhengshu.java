package com.leiyu.designpattern.temporary;

import java.io.*;

/**
 * Created by wh on 2017/3/13.
 */
public class ZhuanliZhengshu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/zhengshu.txt")));
        String line = null;
        while (null != (line = br.readLine())){
            String[] arrs = line.split("\\+\\+\\+");
            String result = "update epm_wenjian set xwenjianmc='专利证书" + arrs[1].substring(arrs[1].lastIndexOf("."))
                    +"' where gg_wj_id = '" + arrs[0] + "';";
            System.out.println(result);
        }
    }
}
