package tenkamochi2.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import tenkamochi2.entity.TMemberClubNames._TMemberClubNames;

/**
 * {@link TClub}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/18 2:03:16")
public class TClubNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * ClubNameのプロパティ名を返します。
     * 
     * @return ClubNameのプロパティ名
     */
    public static PropertyName<String> ClubName() {
        return new PropertyName<String>("ClubName");
    }

    /**
     * OfficerIdのプロパティ名を返します。
     * 
     * @return OfficerIdのプロパティ名
     */
    public static PropertyName<Integer> OfficerId() {
        return new PropertyName<Integer>("OfficerId");
    }

    /**
     * ClubMemoのプロパティ名を返します。
     * 
     * @return ClubMemoのプロパティ名
     */
    public static PropertyName<String> ClubMemo() {
        return new PropertyName<String>("ClubMemo");
    }

    /**
     * tMemberClubListのプロパティ名を返します。
     * 
     * @return tMemberClubListのプロパティ名
     */
    public static _TMemberClubNames tMemberClubList() {
        return new _TMemberClubNames("tMemberClubList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TClubNames extends PropertyName<TClub> {

        /**
         * インスタンスを構築します。
         */
        public _TClubNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TClubNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _TClubNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * ClubNameのプロパティ名を返します。
         *
         * @return ClubNameのプロパティ名
         */
        public PropertyName<String> ClubName() {
            return new PropertyName<String>(this, "ClubName");
        }

        /**
         * OfficerIdのプロパティ名を返します。
         *
         * @return OfficerIdのプロパティ名
         */
        public PropertyName<Integer> OfficerId() {
            return new PropertyName<Integer>(this, "OfficerId");
        }

        /**
         * ClubMemoのプロパティ名を返します。
         *
         * @return ClubMemoのプロパティ名
         */
        public PropertyName<String> ClubMemo() {
            return new PropertyName<String>(this, "ClubMemo");
        }

        /**
         * tMemberClubListのプロパティ名を返します。
         * 
         * @return tMemberClubListのプロパティ名
         */
        public _TMemberClubNames tMemberClubList() {
            return new _TMemberClubNames(this, "tMemberClubList");
        }
    }
}