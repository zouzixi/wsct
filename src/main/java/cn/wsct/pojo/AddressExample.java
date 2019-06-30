package cn.wsct.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andATelephoneIsNull() {
            addCriterion("a_telephone is null");
            return (Criteria) this;
        }

        public Criteria andATelephoneIsNotNull() {
            addCriterion("a_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andATelephoneEqualTo(String value) {
            addCriterion("a_telephone =", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotEqualTo(String value) {
            addCriterion("a_telephone <>", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneGreaterThan(String value) {
            addCriterion("a_telephone >", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("a_telephone >=", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLessThan(String value) {
            addCriterion("a_telephone <", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLessThanOrEqualTo(String value) {
            addCriterion("a_telephone <=", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLike(String value) {
            addCriterion("a_telephone like", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotLike(String value) {
            addCriterion("a_telephone not like", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneIn(List<String> values) {
            addCriterion("a_telephone in", values, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotIn(List<String> values) {
            addCriterion("a_telephone not in", values, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneBetween(String value1, String value2) {
            addCriterion("a_telephone between", value1, value2, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotBetween(String value1, String value2) {
            addCriterion("a_telephone not between", value1, value2, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andAProvinceIsNull() {
            addCriterion("a_province is null");
            return (Criteria) this;
        }

        public Criteria andAProvinceIsNotNull() {
            addCriterion("a_province is not null");
            return (Criteria) this;
        }

        public Criteria andAProvinceEqualTo(String value) {
            addCriterion("a_province =", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceNotEqualTo(String value) {
            addCriterion("a_province <>", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceGreaterThan(String value) {
            addCriterion("a_province >", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("a_province >=", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceLessThan(String value) {
            addCriterion("a_province <", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceLessThanOrEqualTo(String value) {
            addCriterion("a_province <=", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceLike(String value) {
            addCriterion("a_province like", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceNotLike(String value) {
            addCriterion("a_province not like", value, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceIn(List<String> values) {
            addCriterion("a_province in", values, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceNotIn(List<String> values) {
            addCriterion("a_province not in", values, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceBetween(String value1, String value2) {
            addCriterion("a_province between", value1, value2, "aProvince");
            return (Criteria) this;
        }

        public Criteria andAProvinceNotBetween(String value1, String value2) {
            addCriterion("a_province not between", value1, value2, "aProvince");
            return (Criteria) this;
        }

        public Criteria andACityIsNull() {
            addCriterion("a_city is null");
            return (Criteria) this;
        }

        public Criteria andACityIsNotNull() {
            addCriterion("a_city is not null");
            return (Criteria) this;
        }

        public Criteria andACityEqualTo(String value) {
            addCriterion("a_city =", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityNotEqualTo(String value) {
            addCriterion("a_city <>", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityGreaterThan(String value) {
            addCriterion("a_city >", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityGreaterThanOrEqualTo(String value) {
            addCriterion("a_city >=", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityLessThan(String value) {
            addCriterion("a_city <", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityLessThanOrEqualTo(String value) {
            addCriterion("a_city <=", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityLike(String value) {
            addCriterion("a_city like", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityNotLike(String value) {
            addCriterion("a_city not like", value, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityIn(List<String> values) {
            addCriterion("a_city in", values, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityNotIn(List<String> values) {
            addCriterion("a_city not in", values, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityBetween(String value1, String value2) {
            addCriterion("a_city between", value1, value2, "aCity");
            return (Criteria) this;
        }

        public Criteria andACityNotBetween(String value1, String value2) {
            addCriterion("a_city not between", value1, value2, "aCity");
            return (Criteria) this;
        }

        public Criteria andAAreaIsNull() {
            addCriterion("a_area is null");
            return (Criteria) this;
        }

        public Criteria andAAreaIsNotNull() {
            addCriterion("a_area is not null");
            return (Criteria) this;
        }

        public Criteria andAAreaEqualTo(String value) {
            addCriterion("a_area =", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaNotEqualTo(String value) {
            addCriterion("a_area <>", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaGreaterThan(String value) {
            addCriterion("a_area >", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaGreaterThanOrEqualTo(String value) {
            addCriterion("a_area >=", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaLessThan(String value) {
            addCriterion("a_area <", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaLessThanOrEqualTo(String value) {
            addCriterion("a_area <=", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaLike(String value) {
            addCriterion("a_area like", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaNotLike(String value) {
            addCriterion("a_area not like", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaIn(List<String> values) {
            addCriterion("a_area in", values, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaNotIn(List<String> values) {
            addCriterion("a_area not in", values, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaBetween(String value1, String value2) {
            addCriterion("a_area between", value1, value2, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaNotBetween(String value1, String value2) {
            addCriterion("a_area not between", value1, value2, "aArea");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNull() {
            addCriterion("a_username is null");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNotNull() {
            addCriterion("a_username is not null");
            return (Criteria) this;
        }

        public Criteria andAUsernameEqualTo(String value) {
            addCriterion("a_username =", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotEqualTo(String value) {
            addCriterion("a_username <>", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThan(String value) {
            addCriterion("a_username >", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("a_username >=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThan(String value) {
            addCriterion("a_username <", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThanOrEqualTo(String value) {
            addCriterion("a_username <=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLike(String value) {
            addCriterion("a_username like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotLike(String value) {
            addCriterion("a_username not like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameIn(List<String> values) {
            addCriterion("a_username in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotIn(List<String> values) {
            addCriterion("a_username not in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameBetween(String value1, String value2) {
            addCriterion("a_username between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotBetween(String value1, String value2) {
            addCriterion("a_username not between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAStreetIsNull() {
            addCriterion("a_street is null");
            return (Criteria) this;
        }

        public Criteria andAStreetIsNotNull() {
            addCriterion("a_street is not null");
            return (Criteria) this;
        }

        public Criteria andAStreetEqualTo(String value) {
            addCriterion("a_street =", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetNotEqualTo(String value) {
            addCriterion("a_street <>", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetGreaterThan(String value) {
            addCriterion("a_street >", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetGreaterThanOrEqualTo(String value) {
            addCriterion("a_street >=", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetLessThan(String value) {
            addCriterion("a_street <", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetLessThanOrEqualTo(String value) {
            addCriterion("a_street <=", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetLike(String value) {
            addCriterion("a_street like", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetNotLike(String value) {
            addCriterion("a_street not like", value, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetIn(List<String> values) {
            addCriterion("a_street in", values, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetNotIn(List<String> values) {
            addCriterion("a_street not in", values, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetBetween(String value1, String value2) {
            addCriterion("a_street between", value1, value2, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAStreetNotBetween(String value1, String value2) {
            addCriterion("a_street not between", value1, value2, "aStreet");
            return (Criteria) this;
        }

        public Criteria andAPostcodeIsNull() {
            addCriterion("a_postCode is null");
            return (Criteria) this;
        }

        public Criteria andAPostcodeIsNotNull() {
            addCriterion("a_postCode is not null");
            return (Criteria) this;
        }

        public Criteria andAPostcodeEqualTo(String value) {
            addCriterion("a_postCode =", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeNotEqualTo(String value) {
            addCriterion("a_postCode <>", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeGreaterThan(String value) {
            addCriterion("a_postCode >", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("a_postCode >=", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeLessThan(String value) {
            addCriterion("a_postCode <", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeLessThanOrEqualTo(String value) {
            addCriterion("a_postCode <=", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeLike(String value) {
            addCriterion("a_postCode like", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeNotLike(String value) {
            addCriterion("a_postCode not like", value, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeIn(List<String> values) {
            addCriterion("a_postCode in", values, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeNotIn(List<String> values) {
            addCriterion("a_postCode not in", values, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeBetween(String value1, String value2) {
            addCriterion("a_postCode between", value1, value2, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPostcodeNotBetween(String value1, String value2) {
            addCriterion("a_postCode not between", value1, value2, "aPostcode");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNull() {
            addCriterion("a_phone is null");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNotNull() {
            addCriterion("a_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAPhoneEqualTo(String value) {
            addCriterion("a_phone =", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotEqualTo(String value) {
            addCriterion("a_phone <>", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThan(String value) {
            addCriterion("a_phone >", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("a_phone >=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThan(String value) {
            addCriterion("a_phone <", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThanOrEqualTo(String value) {
            addCriterion("a_phone <=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLike(String value) {
            addCriterion("a_phone like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotLike(String value) {
            addCriterion("a_phone not like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneIn(List<String> values) {
            addCriterion("a_phone in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotIn(List<String> values) {
            addCriterion("a_phone not in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneBetween(String value1, String value2) {
            addCriterion("a_phone between", value1, value2, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotBetween(String value1, String value2) {
            addCriterion("a_phone not between", value1, value2, "aPhone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}