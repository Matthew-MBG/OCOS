subSettings.add( new BooleanElement( "Enabled" /* Display name */, new ControlElement.IconData( Material.LEVER ), new Consumer<Boolean>() {
    @Override
    public void accept( Boolean accepted ) {
        System.out.println( "Changed value: " + accepted );
    }
} /* Change listener */, true /* current value */ ) );

final DropDownMenu<EnumModuleAlignment> alignmentDropDownMenu = new DropDownMenu<EnumModuleAlignment>( "Custom Alignment" /* Display name */, 0, 0, 0, 0 )
                .fill( EnumModuleAlignment.values() );
DropDownElement<EnumModuleAlignment> alignmentDropDown = new DropDownElement<EnumModuleAlignment>( "Custom Alignment", alignmentDropDownMenu );

// Set selected entry
alignmentDropDownMenu.setSelected( EnumModuleAlignment.DEFAULT );

// Listen on changes
alignmentDropDown.setChangeListener( new Consumer<EnumModuleAlignment>() {
    @Override
    public void accept( EnumModuleAlignment alignment ) {
        System.out.println( "New selected alignment: " + alignment.name() );
    }
} );

// Change entry design (optional)
alignmentDropDownMenu.setEntryDrawer( new DropDownMenu.DropDownEntryDrawer() {
    @Override
    public void draw( Object object, int x, int y, String trimmedEntry ) {
        // We translate the value and draw it
        String entry = object.toString().toLowerCase();
        LabyMod.getInstance().getDrawUtils().drawString( LanguageManager.translate( entry ), x, y );
    }
} );

// Add to sublist
subSettings.add( alignmentDropDown );
