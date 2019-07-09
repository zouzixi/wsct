package cn.wsct.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmIdEqualTo(Integer value) {
            addCriterion("sm_id =", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotEqualTo(Integer value) {
            addCriterion("sm_id <>", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThan(Integer value) {
            addCriterion("sm_id >", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_id >=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThan(Integer value) {
            addCriterion("sm_id <", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_id <=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdIn(List<Integer> values) {
            addCriterion("sm_id in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotIn(List<Integer> values) {
            addCriterion("sm_id not in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_id between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_id not between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andOTelephoneIsNull() {
            addCriterion("o_telephone is null");
            return (Criteria) this;
        }

        public Criteria andOTelephoneIsNotNull() {
            addCriterion("o_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andOTelephoneEqualTo(String value) {
            addCriterion("o_telephone =", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneNotEqualTo(String value) {
            addCriterion("o_telephone <>", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneGreaterThan(String value) {
            addCriterion("o_telephone >", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("o_telephone >=", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneLessThan(String value) {
            addCriterion("o_telephone <", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneLessThanOrEqualTo(String value) {
            addCriterion("o_telephone <=", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneLike(String value) {
            addCriterion("o_telephone like", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneNotLike(String value) {
            addCriterion("o_telephone not like", value, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneIn(List<String> values) {
            addCriterion("o_telephone in", values, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneNotIn(List<String> values) {
            addCriterion("o_telephone not in", values, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneBetween(String value1, String value2) {
            addCriterion("o_telephone between", value1, value2, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOTelephoneNotBetween(String value1, String value2) {
            addCriterion("o_telephone not between", value1, value2, "oTelephone");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeIsNull() {
            addCriterion("o_orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeIsNotNull() {
            addCriterion("o_orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeEqualTo(Date value) {
            addCriterion("o_orderTime =", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeNotEqualTo(Date value) {
            addCriterion("o_orderTime <>", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeGreaterThan(Date value) {
            addCriterion("o_orderTime >", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_orderTime >=", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeLessThan(Date value) {
            addCriterion("o_orderTime <", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("o_orderTime <=", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeIn(List<Date> values) {
            addCriterion("o_orderTime in", values, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeNotIn(List<Date> values) {
            addCriterion("o_orderTime not in", values, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeBetween(Date value1, Date value2) {
            addCriterion("o_orderTime between", value1, value2, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("o_orderTime not between", value1, value2, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOUsernameIsNull() {
            addCriterion("o_username is null");
            return (Criteria) this;
        }

        public Criteria andOUsernameIsNotNull() {
            addCriterion("o_username is not null");
            return (Criteria) this;
        }

        public Criteria andOUsernameEqualTo(String value) {
            addCriterion("o_username =", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameNotEqualTo(String value) {
            addCriterion("o_username <>", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameGreaterThan(String value) {
            addCriterion("o_username >", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("o_username >=", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameLessThan(String value) {
            addCriterion("o_username <", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameLessThanOrEqualTo(String value) {
            addCriterion("o_username <=", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameLike(String value) {
            addCriterion("o_username like", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameNotLike(String value) {
            addCriterion("o_username not like", value, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameIn(List<String> values) {
            addCriterion("o_username in", values, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameNotIn(List<String> values) {
            addCriterion("o_username not in", values, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameBetween(String value1, String value2) {
            addCriterion("o_username between", value1, value2, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOUsernameNotBetween(String value1, String value2) {
            addCriterion("o_username not between", value1, value2, "oUsername");
            return (Criteria) this;
        }

        public Criteria andOMoneyIsNull() {
            addCriterion("o_money is null");
            return (Criteria) this;
        }

        public Criteria andOMoneyIsNotNull() {
            addCriterion("o_money is not null");
            return (Criteria) this;
        }

        public Criteria andOMoneyEqualTo(Double value) {
            addCriterion("o_money =", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotEqualTo(Double value) {
            addCriterion("o_money <>", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyGreaterThan(Double value) {
            addCriterion("o_money >", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("o_money >=", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyLessThan(Double value) {
            addCriterion("o_money <", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyLessThanOrEqualTo(Double value) {
            addCriterion("o_money <=", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyIn(List<Double> values) {
            addCriterion("o_money in", values, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotIn(List<Double> values) {
            addCriterion("o_money not in", values, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyBetween(Double value1, Double value2) {
            addCriterion("o_money between", value1, value2, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotBetween(Double value1, Double value2) {
            addCriterion("o_money not between", value1, value2, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(Integer value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(Integer value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(Integer value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(Integer value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(Integer value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<Integer> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<Integer> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(Integer value1, Integer value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andONumberIsNull() {
            addCriterion("o_number is null");
            return (Criteria) this;
        }

        public Criteria andONumberIsNotNull() {
            addCriterion("o_number is not null");
            return (Criteria) this;
        }

        public Criteria andONumberEqualTo(Integer value) {
            addCriterion("o_number =", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotEqualTo(Integer value) {
            addCriterion("o_number <>", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberGreaterThan(Integer value) {
            addCriterion("o_number >", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_number >=", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberLessThan(Integer value) {
            addCriterion("o_number <", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberLessThanOrEqualTo(Integer value) {
            addCriterion("o_number <=", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberIn(List<Integer> values) {
            addCriterion("o_number in", values, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotIn(List<Integer> values) {
            addCriterion("o_number not in", values, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberBetween(Integer value1, Integer value2) {
            addCriterion("o_number between", value1, value2, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotBetween(Integer value1, Integer value2) {
            addCriterion("o_number not between", value1, value2, "oNumber");
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