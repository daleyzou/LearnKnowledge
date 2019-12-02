package daleyzou.cache;

/**
 * ObjVo
 * @description TODO
 * @author daleyzou
 * @date 2019年12月02日 21:31
 * @version 3.0.0
 */
public class ObjVo {
    private Integer id;
    private String name;

    public ObjVo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
