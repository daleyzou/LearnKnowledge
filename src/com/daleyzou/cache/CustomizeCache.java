package daleyzou.cache;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * CustomizeCache
 * @description TODO
 * @author daleyzou
 * @date 2019年12月02日 21:28
 * @version 3.0.0
 */
public class CustomizeCache {
    static ConcurrentHashMap<Integer, ObjVo> map;
    static {
        map = new ConcurrentHashMap();
    }

     public static void setMap(ObjVo vo){
         ObjVo objVo = map.get(vo.getId());
         if (objVo != null){
             return;
         }
         System.out.println("设置值:" + vo.getId().toString());
         map.put(vo.getId(), vo);
     }

     public static ObjVo getMap(Integer id){
         ObjVo objVo = map.get(id);
         if (objVo == null){
             System.out.println("从数据库获取值" + id.toString());
             objVo = getFromDb(id);
             map.put(objVo.getId(), objVo);
         }
         return objVo;
     }

    private  static ObjVo getFromDb(Integer id) {
        return new ObjVo(id, "auto generate");
    }
}
