package tenkamochi2.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link TPartyDrinkAttend}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/19 22:50:32")
public class TPartyDrinkAttendNames {

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
    public static PropertyName<Integer> memberNum() {
        return new PropertyName<Integer>("memberNum");
    }

    /**
     * partyNumのプロパティ名を返します。
     * 
     * @return partyNumのプロパティ名
     */
    public static PropertyName<Integer> partyNum() {
        return new PropertyName<Integer>("partyNum");
    }

    /**
     * partyAttendFlragのプロパティ名を返します。
     * 
     * @return partyAttendFlragのプロパティ名
     */
    public static PropertyName<Integer> partyAttendFlrag() {
        return new PropertyName<Integer>("partyAttendFlrag");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TPartyDrinkAttendNames extends PropertyName<TPartyDrinkAttend> {

        /**
         * インスタンスを構築します。
         */
        public _TPartyDrinkAttendNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TPartyDrinkAttendNames(final String name) {
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
        public _TPartyDrinkAttendNames(final PropertyName<?> parent, final String name) {
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
        public PropertyName<Integer> memberNum() {
            return new PropertyName<Integer>(this, "memberNum");
        }

        /**
         * partyNumのプロパティ名を返します。
         *
         * @return partyNumのプロパティ名
         */
        public PropertyName<Integer> partyNum() {
            return new PropertyName<Integer>(this, "partyNum");
        }

        /**
         * partyAttendFlragのプロパティ名を返します。
         *
         * @return partyAttendFlragのプロパティ名
         */
        public PropertyName<Integer> partyAttendFlrag() {
            return new PropertyName<Integer>(this, "partyAttendFlrag");
        }
    }
}