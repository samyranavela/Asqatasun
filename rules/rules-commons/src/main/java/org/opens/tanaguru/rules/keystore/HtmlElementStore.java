/*
 *  Tanaguru - Automated webpage assessment
 *  Copyright (C) 2008-2013  Open-S Company
 * 
 *  This file is part of Tanaguru.
 * 
 *  Tanaguru is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 *  Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tanaguru.rules.keystore;

import javax.swing.text.html.HTML;

/**
 * Utility class that stores html element types as static String
 */
public final class HtmlElementStore {

    public static final String A_ELEMENT = HTML.Tag.A.toString();
    public static final String ABBR_ELEMENT = "abbr";
    public static final String ACRONYM_ELEMENT = "acronym";
    public static final String APPLET_ELEMENT = HTML.Tag.APPLET.toString();
    public static final String AREA_ELEMENT = HTML.Tag.AREA.toString();
    public static final String BODY_ELEMENT = HTML.Tag.BODY.toString();
    public static final String BUTTON_ELEMENT = "button";
    public static final String CAPTION_ELEMENT = HTML.Tag.CAPTION.toString();
    public static final String COMMENT_ELEMENT = HTML.Tag.COMMENT.toString();
    public static final String DIV_ELEMENT = HTML.Tag.DIV.toString();
    public static final String EMBED_ELEMENT = "embed";
    public static final String FIELDSET_ELEMENT = "fieldset";
    public static final String FORM_ELEMENT = HTML.Tag.FORM.toString();
    public static final String FRAME_ELEMENT = HTML.Tag.FRAME.toString();
    public static final String H1_ELEMENT = HTML.Tag.H1.toString();
    public static final String H2_ELEMENT = HTML.Tag.H2.toString();
    public static final String H3_ELEMENT = HTML.Tag.H3.toString();
    public static final String H4_ELEMENT = HTML.Tag.H4.toString();
    public static final String H5_ELEMENT = HTML.Tag.H5.toString();
    public static final String H6_ELEMENT = HTML.Tag.H6.toString();
    public static final String HEAD_ELEMENT = HTML.Tag.HEAD.toString();
    public static final String HTML_ELEMENT = HTML.Tag.HTML.toString();
    public static final String IFRAME_ELEMENT = "iframe";
    public static final String IMG_ELEMENT = HTML.Tag.IMG.toString();
    public static final String INPUT_ELEMENT = HTML.Tag.INPUT.toString();
    public static final String LABEL_ELEMENT = "label";
    public static final String LEGEND_ELEMENT = "legend";
    public static final String OBJECT_ELEMENT = HTML.Tag.OBJECT.toString();
    public static final String OPTION_ELEMENT = HTML.Tag.OPTION.toString();
    public static final String OPTGROUP_ELEMENT = "optgroup";
    public static final String P_ELEMENT = HTML.Tag.P.toString();
    public static final String SELECT_ELEMENT = HTML.Tag.SELECT.toString();
    public static final String SPAN_ELEMENT = HTML.Tag.SPAN.toString();
    public static final String STRONG_ELEMENT = HTML.Tag.STRONG.toString();
    public static final String TABLE_ELEMENT = HTML.Tag.TABLE.toString();
    public static final String TEXTAREA_ELEMENT = HTML.Tag.TEXTAREA.toString();
    public static final String TITLE_ELEMENT = HTML.Tag.TITLE.toString();
    public static final String TEXT_ELEMENT = "#text";
    public static final String TEXT_ELEMENT2 = "text";
    
    /**
     * Private constructor. This class handles keys and must not be instanciated
     */
    private HtmlElementStore() {}

}