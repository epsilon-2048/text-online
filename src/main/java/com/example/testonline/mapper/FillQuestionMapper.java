package com.example.testonline.mapper;

import com.example.testonline.pojo.Fillquestion;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface FillQuestionMapper {
    @Select("SELECT * FROM `tos_fillquestion` LIMIT #{upper},#{leter}")
    List<Fillquestion> getListFormAtoB(int upper, int leter);

    @Select("SELECT * FROM `tos_fillquestion`")
    List<Fillquestion> getListAll();

    @Delete("DELETE FROM `tos_fillquestion` WHERE `fid` = '${fid}';")
    int delete(@Param("fid") int fid);

    @Insert("INSERT INTO `tos_fillquestion`(`fquestion`,`fanswer`) VALUES(#{fquestion},#{fanswer});")
    int insert(Fillquestion fillquestion);

    @Update("UPDATE `tos_fillquestion` SET `fquestion`=#{fquestion},`fanswer`=#{fanswer} WHERE `fid` = #{fid}")
    int update(Fillquestion fillquestion);
}
