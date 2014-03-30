package tenkamochi2.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import tenkamochi2.entity.TMemberClubNames._TMemberClubNames;
import tenkamochi2.entity.TPartyAttendNames._TPartyAttendNames;

/**
 * {@link TMember}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/25 17:42:08")
public class TMemberNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * hnameのプロパティ名を返します。
     * 
     * @return hnameのプロパティ名
     */
    public static PropertyName<String> hname() {
        return new PropertyName<String>("hname");
    }

    /**
     * sexのプロパティ名を返します。
     * 
     * @return sexのプロパティ名
     */
    public static PropertyName<String> sex() {
        return new PropertyName<String>("sex");
    }

    /**
     * mailのプロパティ名を返します。
     * 
     * @return mailのプロパティ名
     */
    public static PropertyName<String> mail() {
        return new PropertyName<String>("mail");
    }

    /**
     * departmentのプロパティ名を返します。
     * 
     * @return departmentのプロパティ名
     */
    public static PropertyName<String> department() {
        return new PropertyName<String>("department");
    }

    /**
     * curriculumのプロパティ名を返します。
     * 
     * @return curriculumのプロパティ名
     */
    public static PropertyName<String> curriculum() {
        return new PropertyName<String>("curriculum");
    }

    /**
     * entranceのプロパティ名を返します。
     * 
     * @return entranceのプロパティ名
     */
    public static PropertyName<Integer> entrance() {
        return new PropertyName<Integer>("entrance");
    }

    /**
     * tel1のプロパティ名を返します。
     * 
     * @return tel1のプロパティ名
     */
    public static PropertyName<Integer> tel1() {
        return new PropertyName<Integer>("tel1");
    }

    /**
     * tel2のプロパティ名を返します。
     * 
     * @return tel2のプロパティ名
     */
    public static PropertyName<Integer> tel2() {
        return new PropertyName<Integer>("tel2");
    }

    /**
     * tel3のプロパティ名を返します。
     * 
     * @return tel3のプロパティ名
     */
    public static PropertyName<Integer> tel3() {
        return new PropertyName<Integer>("tel3");
    }

    /**
     * officerのプロパティ名を返します。
     * 
     * @return officerのプロパティ名
     */
    public static PropertyName<String> officer() {
        return new PropertyName<String>("officer");
    }

    /**
     * userNameのプロパティ名を返します。
     * 
     * @return userNameのプロパティ名
     */
    public static PropertyName<String> userName() {
        return new PropertyName<String>("userName");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * tMemberClubeListのプロパティ名を返します。
     * 
     * @return tMemberClubeListのプロパティ名
     */
    public static _TMemberClubNames tMemberClubeList() {
        return new _TMemberClubNames("tMemberClubeList");
    }

    /**
     * attendListのプロパティ名を返します。
     * 
     * @return attendListのプロパティ名
     */
    public static _TPartyAttendNames attendList() {
        return new _TPartyAttendNames("attendList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TMemberNames extends PropertyName<TMember> {

        /**
         * インスタンスを構築します。
         */
        public _TMemberNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TMemberNames(final String name) {
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
        public _TMemberNames(final PropertyName<?> parent, final String name) {
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
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * hnameのプロパティ名を返します。
         *
         * @return hnameのプロパティ名
         */
        public PropertyName<String> hname() {
            return new PropertyName<String>(this, "hname");
        }

        /**
         * sexのプロパティ名を返します。
         *
         * @return sexのプロパティ名
         */
        public PropertyName<String> sex() {
            return new PropertyName<String>(this, "sex");
        }

        /**
         * mailのプロパティ名を返します。
         *
         * @return mailのプロパティ名
         */
        public PropertyName<String> mail() {
            return new PropertyName<String>(this, "mail");
        }

        /**
         * departmentのプロパティ名を返します。
         *
         * @return departmentのプロパティ名
         */
        public PropertyName<String> department() {
            return new PropertyName<String>(this, "department");
        }

        /**
         * curriculumのプロパティ名を返します。
         *
         * @return curriculumのプロパティ名
         */
        public PropertyName<String> curriculum() {
            return new PropertyName<String>(this, "curriculum");
        }

        /**
         * entranceのプロパティ名を返します。
         *
         * @return entranceのプロパティ名
         */
        public PropertyName<Integer> entrance() {
            return new PropertyName<Integer>(this, "entrance");
        }

        /**
         * tel1のプロパティ名を返します。
         *
         * @return tel1のプロパティ名
         */
        public PropertyName<Integer> tel1() {
            return new PropertyName<Integer>(this, "tel1");
        }

        /**
         * tel2のプロパティ名を返します。
         *
         * @return tel2のプロパティ名
         */
        public PropertyName<Integer> tel2() {
            return new PropertyName<Integer>(this, "tel2");
        }

        /**
         * tel3のプロパティ名を返します。
         *
         * @return tel3のプロパティ名
         */
        public PropertyName<Integer> tel3() {
            return new PropertyName<Integer>(this, "tel3");
        }

        /**
         * officerのプロパティ名を返します。
         *
         * @return officerのプロパティ名
         */
        public PropertyName<String> officer() {
            return new PropertyName<String>(this, "officer");
        }

        /**
         * userNameのプロパティ名を返します。
         *
         * @return userNameのプロパティ名
         */
        public PropertyName<String> userName() {
            return new PropertyName<String>(this, "userName");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * tMemberClubeListのプロパティ名を返します。
         * 
         * @return tMemberClubeListのプロパティ名
         */
        public _TMemberClubNames tMemberClubeList() {
            return new _TMemberClubNames(this, "tMemberClubeList");
        }

        /**
         * attendListのプロパティ名を返します。
         * 
         * @return attendListのプロパティ名
         */
        public _TPartyAttendNames attendList() {
            return new _TPartyAttendNames(this, "attendList");
        }
    }
}