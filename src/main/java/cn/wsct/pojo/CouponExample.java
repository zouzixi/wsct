package cn.wsct.pojo;

import java.util.ArrayList;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCTelephneIsNull() {
            addCriterion("c_telephne is null");
            return (Criteria) this;
        }

        public Criteria andCTelephneIsNotNull() {
            addCriterion("c_telephne is not null");
            return (Criteria) this;
        }

        public Criteria andCTelephneEqualTo(String value) {
            addCriterion("c_telephne =", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneNotEqualTo(String value) {
            addCriterion("c_telephne <>", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneGreaterThan(String value) {
            addCriterion("c_telephne >", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneGreaterThanOrEqualTo(String value) {
            addCriterion("c_telephne >=", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneLessThan(String value) {
            addCriterion("c_telephne <", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneLessThanOrEqualTo(String value) {
            addCriterion("c_telephne <=", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneLike(String value) {
            addCriterion("c_telephne like", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneNotLike(String value) {
            addCriterion("c_telephne not like", value, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneIn(List<String> values) {
            addCriterion("c_telephne in", values, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneNotIn(List<String> values) {
            addCriterion("c_telephne not in", values, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneBetween(String value1, String value2) {
            addCriterion("c_telephne between", value1, value2, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCTelephneNotBetween(String value1, String value2) {
            addCriterion("c_telephne not between", value1, value2, "cTelephne");
            return (Criteria) this;
        }

        public Criteria andCDetailsIsNull() {
            addCriterion("c_details is null");
            return (Criteria) this;
        }

        public Criteria andCDetailsIsNotNull() {
            addCriterion("c_details is not null");
            return (Criteria) this;
        }

        public Criteria andCDetailsEqualTo(String value) {
            addCriterion("c_details =", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotEqualTo(String value) {
            addCriterion("c_details <>", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsGreaterThan(String value) {
            addCriterion("c_details >", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("c_details >=", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsLessThan(String value) {
            addCriterion("c_details <", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsLessThanOrEqualTo(String value) {
            addCriterion("c_details <=", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsLike(String value) {
            addCriterion("c_details like", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotLike(String value) {
            addCriterion("c_details not like", value, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsIn(List<String> values) {
            addCriterion("c_details in", values, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotIn(List<String> values) {
            addCriterion("c_details not in", values, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsBetween(String value1, String value2) {
            addCriterion("c_details between", value1, value2, "cDetails");
            return (Criteria) this;
        }

        public Criteria andCDetailsNotBetween(String value1, String value2) {
            addCriterion("c_details not between", value1, value2, "cDetails");
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