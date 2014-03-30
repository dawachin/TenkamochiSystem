package tenkamochi2.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import tenkamochi2.entity.TMemberNames._TMemberNames;
import tenkamochi2.entity.TPartyNames._TPartyNames;

/**
 * {@link TPartyAttend}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/25 17:42:09")
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
     * memberIdのプロパティ名を返します。
     * 
     * @return memberIdのプロパティ名
     */
    public static PropertyName<Integer> memberId() {
        return new PropertyName<Integer>("memberId");
    }

    /**
     * partyIdのプロパティ名を返します。
     * 
     * @return partyIdのプロパティ名
     */
    public static PropertyName<Integer> partyId() {
        return new PropertyName<Integer>("partyId");
    }

    /**
     * drinkAtのプロパティ名を返します。
     * 
     * @return drinkAtのプロパティ名
     */
    public static PropertyName<Integer> drinkAt() {
        return new PropertyName<Integer>("drinkAt");
    }

    /**
     * meetingAtのプロパティ名を返します。
     * 
     * @return meetingAtのプロパティ名
     */
    public static PropertyName<Integer> meetingAt() {
        return new PropertyName<Integer>("meetingAt");
    }

    /**
     * tMemberのプロパティ名を返します。
     * 
     * @return tMemberのプロパティ名
     */
    public static _TMemberNames tMember() {
        return new _TMemberNames("tMember");
    }

    /**
     * tPartyのプロパティ名を返します。
     * 
     * @return tPartyのプロパティ名
     */
    public static _TPartyNames tParty() {
        return new _TPartyNames("tParty");
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
         * memberIdのプロパティ名を返します。
         *
         * @return memberIdのプロパティ名
         */
        public PropertyName<Integer> memberId() {
            return new PropertyName<Integer>(this, "memberId");
        }

        /**
         * partyIdのプロパティ名を返します。
         *
         * @return partyIdのプロパティ名
         */
        public PropertyName<Integer> partyId() {
            return new PropertyName<Integer>(this, "partyId");
        }

        /**
         * drinkAtのプロパティ名を返します。
         *
         * @return drinkAtのプロパティ名
         */
        public PropertyName<Integer> drinkAt() {
            return new PropertyName<Integer>(this, "drinkAt");
        }

        /**
         * meetingAtのプロパティ名を返します。
         *
         * @return meetingAtのプロパティ名
         */
        public PropertyName<Integer> meetingAt() {
            return new PropertyName<Integer>(this, "meetingAt");
        }

        /**
         * tMemberのプロパティ名を返します。
         * 
         * @return tMemberのプロパティ名
         */
        public _TMemberNames tMember() {
            return new _TMemberNames(this, "tMember");
        }

        /**
         * tPartyのプロパティ名を返します。
         * 
         * @return tPartyのプロパティ名
         */
        public _TPartyNames tParty() {
            return new _TPartyNames(this, "tParty");
        }
    }
}