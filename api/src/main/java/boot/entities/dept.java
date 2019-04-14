package boot.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title dept
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\14 0014 17:49
 */
@NoArgsConstructor
@Data
public class dept {
    private Integer did;
    private String dname;
    private String d_source;
}
