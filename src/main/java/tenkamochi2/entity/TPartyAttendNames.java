package tenkamochi2.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link TPartyAttend}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/23 16:45:43")
public class TPartyAttendNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * memberNumのプロパティ名を返します。
     * 
     * @return memberNumのプロパティ名
     */
    public static PropertyName<String> memberNum() {
        return new PropertyName<String>("memberNum");
    }

    /**
     * partyNumのプロパティ名を返します。
     * 
     * @return partyNumのプロパティ名
     */
    public static PropertyName<String> partyNum() {
        return new PropertyName<String>("partyNum");
    }

    /**
     * partyAttendFlragのプロパティ名を返します。
     * 
     * @return partyAttendFlragのプロパティ名
     */
    public static PropertyName<String> partyAttendFlrag() {
        return new PropertyName<String>("partyAttendFlrag");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TPartyAttendNames extends PropertyName<TPartyAttend> {

        /**
         * インスタンスを構築します。
         */
        public _TPartyAttendNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TPartyAttendNames(final String name) {
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
        public _TPartyAttendNames(final PropertyName<?> parent, final String name) {
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
         * memberNumのプロパティ名を返します。
         *
         * @return memberNumのプロパティ名
         */
        public PropertyName<String> memberNum() {
            return new PropertyName<String>(this, "memberNum");
        }

        /**
         * partyNumのプロパティ名を返します。
         *
         * @return partyNumのプロパティ名
         */
        public PropertyName<String> partyNum() {
            return new PropertyName<String>(this, "partyNum");
        }

        /**
         * partyAttendFlragのプロパティ名を返します。
         *
         * @return partyAttendFlragのプロパティ名
         */
        public PropertyName<String> partyAttendFlrag() {
            return new PropertyName<String>(this, "partyAttendFlrag");
        }
    }
}