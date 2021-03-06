package cn.edu.ustb.dm.dao;

import cn.edu.ustb.dm.model.NationalityInfo;
import cn.edu.ustb.dm.model.NationalityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NationalityInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int countByExample(NationalityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByExample(NationalityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByPrimaryKey(Integer NATIONALITY_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insert(NationalityInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insertSelective(NationalityInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    List<NationalityInfo> selectByExample(NationalityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    NationalityInfo selectByPrimaryKey(Integer NATIONALITY_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExampleSelective(@Param("record") NationalityInfo record, @Param("example") NationalityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExample(@Param("record") NationalityInfo record, @Param("example") NationalityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKeySelective(NationalityInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nationality_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKey(NationalityInfo record);
}