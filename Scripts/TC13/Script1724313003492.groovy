import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com.vn/')

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_Sign in_q'), 'tieng anh')

WebUI.click(findTestObject('Object Repository/Page_tieng anh - Google Search/span_Lp Hc Ting Anh Online - Tieng Anh'))

WebUI.click(findTestObject('Object Repository/Page_Lp Hc Ting Anh Online - Favoes/span_Min Ph Test Trnh  Anh Ng - Hc Th Ting _d9f2ff'))

WebUI.click(findTestObject('Object Repository/Page_Lp Hc Ting Anh Online - Favoes/span_Ting anh cho ngi mt gc - Hc online 1 thy 1 tr'))

WebUI.click(findTestObject('Object Repository/Page_Lp Hc Ting Anh Online - Favoes/span_Tham gia lp online min ph - Hc Ting An_03f404'))

WebUI.switchToWindowTitle('Lý do chọn ACET - Anh ngữ Học thuật')

WebUI.click(findTestObject('Object Repository/Page_L do chn ACET - Anh ng Hc thut/span_Ti sao chn ACET'))

WebUI.click(findTestObject('Object Repository/Page_L do chn ACET - Anh ng Hc thut/a_Anh Ng Hc Thut'))

WebUI.click(findTestObject('Object Repository/Page_Chng trnh Anh ng Hc thut  ACET/span_My IELTS Classroom'))

WebUI.click(findTestObject('Object Repository/Page_Chng trnh Anh ng Hc thut  ACET/a_Kim tra trnh  Ting Anh'))

WebUI.click(findTestObject('Object Repository/Page_Chng trnh Anh ng Hc thut  ACET/a_Thi IELTS ti IDP'))

WebUI.click(findTestObject('Object Repository/Page_Chng trnh Anh ng Hc thut  ACET/a_Gio vin'))

WebUI.click(findTestObject('Object Repository/Page_Tuyn dng gio vin - ACET Anh Ng hc thut_a2c1be/a_Xem thm'))

WebUI.click(findTestObject('Object Repository/Page_ACET is recruiting teachers for School_feaaa0/a_u i'))

WebUI.click(findTestObject('Object Repository/Page_- ACET Anh Ng hc thut - Gio dc quc t/a_Kinh nghim hc IELTS'))

WebUI.click(findTestObject('Object Repository/Page_Kinh nghim hc IELTS - ACET  Anh ng Hc _966036/h3_TI  THI MU IELTS MIN PH'))

WebUI.click(findTestObject('Object Repository/Page_Kinh nghim hc IELTS - ACET  Anh ng Hc _966036/div_Ti sao bn nn tham kho b ti liu luyn thi_477574'))

WebUI.click(findTestObject('Object Repository/Page_Kinh nghim hc IELTS - ACET  Anh ng Hc _966036/span_Lm quen vi cu trc ca bi thi IELTS'))

WebUI.click(findTestObject('Object Repository/Page_Kinh nghim hc IELTS - ACET  Anh ng Hc _966036/span_B ti liu luyn thi IELTS mu ca IDP tng _a385e1'))

WebUI.click(findTestObject('Object Repository/Page_Kinh nghim hc IELTS - ACET  Anh ng Hc _966036/span_nh gi chnh xc nng lc hin ti ca bn thn _98e9e9'))

WebUI.click(findTestObject('Object Repository/Page_Kinh nghim hc IELTS - ACET  Anh ng Hc _966036/span_D dng i chiu v phn tch li trong bi lm _9baa41'))

WebUI.click(findTestObject('Object Repository/Page_Kinh nghim hc IELTS - ACET  Anh ng Hc _966036/a_Phn x ting Anh l g 3 cch luyn phn x ting Anh'))

WebUI.click(findTestObject('Object Repository/Page_Phn x ting Anh l g 3 cch luyn phn x ting Anh/h5_Bi mi ng'))

WebUI.click(findTestObject('Object Repository/Page_Phn x ting Anh l g 3 cch luyn phn x ting Anh/h5_Bi mi ng'))

WebUI.click(findTestObject('Object Repository/Page_Phn x ting Anh l g 3 cch luyn phn x ting Anh/span_Lin h'))

WebUI.click(findTestObject('Object Repository/Page_Phn x ting Anh l g 3 cch luyn phn x ting Anh/a_Search'))

WebUI.click(findTestObject('Object Repository/Page_Lin h - ACET Anh Ng hc thut - Gio dc quc t/div_Trung tm ACET'))

WebUI.click(findTestObject('Object Repository/Page_Lin h - ACET Anh Ng hc thut - Gio dc quc t/p_Vi 2 trung tm ti TP. H Ch Minh v 2 trung _e2511a'))

WebUI.click(findTestObject('Object Repository/Page_Lin h - ACET Anh Ng hc thut - Gio dc quc t/img__vc_single_image-img attachment-full wd_879ad7'))

WebUI.click(findTestObject('Object Repository/Page_Lin h - ACET Anh Ng hc thut - Gio dc quc t/img__vc_single_image-img attachment-full wd_879ad7_1'))

WebUI.switchToWindowTitle('QUALITY CENTRES – NEAS')

WebUI.click(findTestObject('Object Repository/Page_QUALITY CENTRES  NEAS/a_Quality Products  Services'))

WebUI.click(findTestObject('Object Repository/Page_QUALITY AGENTS  NEAS/a_Resources'))

WebUI.click(findTestObject('Object Repository/Page_RESOURCES  NEAS/a_Professional Development'))

WebUI.click(findTestObject('Object Repository/Page_PROFESSIONAL DEVELOPMENT  NEAS/a_Quality Assurance'))

WebUI.closeBrowser()

