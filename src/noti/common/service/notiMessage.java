package noti.common.service;

import java.sql.SQLOutput;
import java.util.*;

import noti.common.MessageFrom;
import noti.common.dto.UserDTO;
import noti.common.dto.TemplateDTO;


public class notiMessage
{
    public static void main(String[] args)
    {
        // user list 불러옴
        List<UserDTO> userList = new ArrayList();

        String notiType = MessageFrom.APPLE.toString();

        // 각 그룹별 template 을 구성한다.
        List<Map<String, TemplateDTO>>  tempGroup = makeTempGroup();

        // 각 그룹별 user List를 구성한다.
        Map<String, List<UserDTO>> userGroup = makeUserGroup();

        // 알림을 전송한다.

    }

    private static List<Map<String, TemplateDTO>> makeTempGroup()
    {
        List<Map<String, TemplateDTO>> tempGroup = new ArrayList<>();

        switch(notiType)
        {
            case APPLE:
                tempGroup = makeAppleTemplate();
                break;
            case PEACH:
                tempGroup = makePeachTemplate();
                break;
            case COFFEE:
                tempGroup = makeCoffeeTemplate();
                break;
            case CAKE:
                tempGroup = makeCakeTemplate();
                break;
            default:
                System.out.println("템플릿 생성 fail");
                break;
        }

        return tempGroup;
    }


    private static Map<String, List<UserDTO>> makeUserGroup()
    {
        Map<String, List<UserDTO>> userGroup = new HashMap();

        switch(notiType)
        {
            case APPLE:
                getAppleUserList();
                break;
            case PEACH:
                getPeachUserList();
                break;
            case COFFEE:
                getCoffeeUserList();
                break;
            case CAKE:
                getCakeUserList();
                break;
            default:
                System.out.println("User List 가져오기 fail");
                break;
        }

        return userGroup;
    }

    private static List<Map<String, TemplateDTO>> makeAppleTemplate()
    {
        System.out.println("APPLE=========================");

        Map<String, TemplateDTO> appleTemp = new HashMap();

        System.out.println("APPLE 템플릿 값 가져오기");
        System.out.println("APPLE 과일별로 나눈다.");

        TemplateDTO appleTempDTO1 = new TemplateDTO();
        appleTempDTO1.setTempName("apple1템플릿");
        appleTemp.put("apple1", appleTempDTO1);

        TemplateDTO appleTempDTO2 = new TemplateDTO();
        appleTempDTO2.setTempName("apple2템플릿");
        appleTemp.put("apple2", appleTempDTO2);

        System.out.println("apple 버튼생성");

        List<Map<String, TemplateDTO>> appleTempList = new ArrayList<>();
        appleTempList.add(appleTemp);
        return appleTempList;
    }

    private static List<Map<String, TemplateDTO>> makePeachTemplate()
    {
        System.out.println("PEACH=========================");
        System.out.println("PEACH  템플릿 값 가져오기");
        System.out.println("wo req 템플릿 생성");
    }

    private static List<Map<String, TemplateDTO>> makeCoffeeTemplate()
    {
        System.out.println("COFFEE=========================");
        System.out.println("COFFEE 값 가져오기");

        Map<>
        System.out.println("today work 템플릿 생성");
    }

    private static List<Map<String, TemplateDTO>> makeCakeTemplate()
    {
        System.out.println("CAKE=========================");
        System.out.println("CAKE 값 가져오기");
        System.out.println("today check 템플릿 생성");
    }

    private static void getAppleUserList()
    {
        System.out.println("Apple User List 반환");
    }

    private static void getPeachUserList()
    {
        System.out.println("Peach User List 반환");
    }

    private static void getCoffeeUserList()
    {
        System.out.println("Coffee User List 반환");
    }

    private static void getCakeUserList()
    {
        System.out.println("Cake User List 반환");
    }



    private static void send()
    {

    }




}
