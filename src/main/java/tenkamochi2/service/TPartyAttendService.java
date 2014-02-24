package tenkamochi2.service;

import java.util.List;
import javax.annotation.Generated;
import tenkamochi2.entity.TPartyAttend;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static tenkamochi2.entity.TPartyAttendNames.*;

/**
 * {@link TPartyAttend}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/19 18:24:19")
public class TPartyAttendService extends AbstractService<TPartyAttend> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public TPartyAttend findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<TPartyAttend> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}