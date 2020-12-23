/*
 * Copyright (C) 2020 Newlogic Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 *
 */
package org.idpass.smartscanner.lib

/*
* TODO Remove when idpass-smarscanner-api is available in maven
* */
object ScannerConstants {

    // Scanner
    const val SCANNER = "SCANNER"
    const val MODE = "MODE"
    const val RESULT = "RESULT"

    // Types
    const val BARCODE = "barcode"
    const val IDPASS_LITE = "idpass-lite"
    const val MRZ = "mrz"

    // BARCODE
    const val BARCODE_IMAGE = "BARCODE_IMAGE"
    const val BARCODE_CORNERS = "BARCODE_CORNERS"
    const val BARCODE_VALUE = "BARCODE_VALUE"

    //ID PASS LITE
    const val IDPASS_LITE_FULL_NAME = "IDPASS_LITE_FULL_NAME"
    const val IDPASS_LITE_GIVEN_NAME = "IDPASS_LITE_GIVEN_NAME"
    const val IDPASS_LITE_SURNAME = "IDPASS_LITE_SURNAME"
    const val IDPASS_LITE_DATE_OF_BIRTH = "IDPASS_LITE_DATE_OF_BIRTH"
    const val IDPASS_LITE_PLACE_OF_BIRTH = "IDPASS_LITE_PLACE_OF_BIRTH"
    const val IDPASS_LITE_UIN = "IDPASS_LITE_UIN"
    const val IDPASS_LITE_RAW = "IDPASS_LITE_RAW"

    // MRZ
    const val MRZ_IMAGE = "MRZ_IMAGE"
    const val MRZ_CODE = "MRZ_CODE"
    const val MRZ_CODE_1 = "MRZ_CODE_1"
    const val MRZ_CODE_2 = "MRZ_CODE_2"
    const val MRZ_DATE_OF_BIRTH = "MRZ_DATE_OF_BIRTH"
    const val MRZ_DOCUMENT_NUMBER = "MRZ_DOCUMENT_NUMBER"
    const val MRZ_EXPIRY_DATE = "MRZ_EXPIRY_DATE"
    const val MRZ_FORMAT = "MRZ_FORMAT"
    const val MRZ_GIVEN_NAMES = "MRZ_GIVEN_NAMES"
    const val MRZ_SURNAME = "MRZ_SURNAME"
    const val MRZ_ISSUING_COUNTRY = "MRZ_ISSUING_COUNTRY"
    const val MRZ_NATIONALITY = "MRZ_NATIONALITY"
    const val MRZ_SEX = "MRZ_SEX"
    // MRZ Manual Capture
    const val MRZ_MANUAL_CAPTURE_EXTRA = "MRZ_MANUAL_CAPTURE_EXTRA"
    // MRZ Format
    const val MRZ_FORMAT_EXTRA = "MRZ_FORMAT_EXTRA"
    const val MRZ_FORMAT_MRTD_TD1= "MRTD_TD1"
    const val MRZ_FORMAT_MRP = "MRP"

    // ODK
    const val ODK_INTENT_DATA = "odk_intent_data"

    // Intent
    const val IDPASS_SMARTSCANNER_INTENT = "org.idpass.smartscanner.SCAN"
    const val IDPASS_SMARTSCANNER_ODK_INTENT = "org.idpass.smartscanner.odk.SCAN"
}