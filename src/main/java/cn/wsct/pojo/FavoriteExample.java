package cn.wsct.pojo;

import java.util.ArrayList;
import java.util.List;

public class FavoriteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavoriteExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFTelephoneIsNull() {
            addCriterion("f_telephone is null");
            return (Criteria) this;
        }

        public Criteria andFTelephoneIsNotNull() {
            addCriterion("f_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andFTelephoneEqualTo(String value) {
            addCriterion("f_telephone =", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotEqualTo(String value) {
            addCriterion("f_telephone <>", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneGreaterThan(String value) {
            addCriterion("f_telephone >", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("f_telephone >=", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneLessThan(String value) {
            addCriterion("f_telephone <", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneLessThanOrEqualTo(String value) {
            addCriterion("f_telephone <=", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneLike(String value) {
            addCriterion("f_telephone like", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotLike(String value) {
            addCriterion("f_telephone not like", value, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneIn(List<String> values) {
            addCriterion("f_telephone in", values, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotIn(List<String> values) {
            addCriterion("f_telephone not in", values, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneBetween(String value1, String value2) {
            addCriterion("f_telephone between", value1, value2, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFTelephoneNotBetween(String value1, String value2) {
            addCriterion("f_telephone not between", value1, value2, "fTelephone");
            return (Criteria) this;
        }

        public Criteria andFDetailIsNull() {
            addCriterion("f_detail is null");
            return (Criteria) this;
        }

        public Criteria andFDetailIsNotNull() {
            addCriterion("f_detail is not null");
            return (Criteria) this;
        }

        public Criteria andFDetailEqualTo(String value) {
            addCriterion("f_detail =", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailNotEqualTo(String value) {
            addCriterion("f_detail <>", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailGreaterThan(String value) {
            addCriterion("f_detail >", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailGreaterThanOrEqualTo(String value) {
            addCriterion("f_detail >=", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailLessThan(String value) {
            addCriterion("f_detail <", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailLessThanOrEqualTo(String value) {
            addCriterion("f_detail <=", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailLike(String value) {
            addCriterion("f_detail like", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailNotLike(String value) {
            addCriterion("f_detail not like", value, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailIn(List<String> values) {
            addCriterion("f_detail in", values, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailNotIn(List<String> values) {
            addCriterion("f_detail not in", values, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailBetween(String value1, String value2) {
            addCriterion("f_detail between", value1, value2, "fDetail");
            return (Criteria) this;
        }

        public Criteria andFDetailNotBetween(String value1, String value2) {
            addCriterion("f_detail not between", value1, value2, "fDetail");
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