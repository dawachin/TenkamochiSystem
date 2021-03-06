package tenkamochi2.service;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import tenkamochi2.entity.TMember;
import static org.seasar.extension.jdbc.operation.Operations.*;
import static tenkamochi2.entity.TMemberNames.*;

/**
 * {@link TMember}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/19 21:04:54")
public class TMemberService extends AbstractService<TMember> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public TMember findById(Integer id) {
        return select().id(id).getSingleResult();
    }
    
    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public List<TMember> findByIdList() {
        return select().getResultList();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<TMember> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
    
    /**
     * useNameとpasswordから検索をする
     * 
     * @return エンティティ
     */
    
    public TMember findById_and_pass(String userName,String password) {
    	SimpleWhere where = new SimpleWhere();
    	where.eq(userName(), userName);
    	where.eq(password(), password);
		return select().where(where).getSingleResult();
	}
    /**
     * バージョン列のチェックを行わない削除メソッド
     * 
     * @return 
     */
    public int deleteIgnoreVersion(TMember deletemember) {
        return this.jdbcManager.delete(deletemember).ignoreVersion().execute();
    }
}