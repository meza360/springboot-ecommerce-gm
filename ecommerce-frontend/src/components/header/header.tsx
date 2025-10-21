'use client';
import { ReactElement } from "react";
import './header.module.css';
import React from 'react';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import { observer } from 'mobx-react-lite';
import Image from 'next/image';
import Link from 'next/link';


function Header({ onNavigation, route }: any): ReactElement {
    return (

        <header>
            <Box sx={{ display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', position: 'sticky', top: 0 }}>
                <Typography variant='body1' fontFamily='Lastica' className="px-3 font-medium">Tech Nerds</Typography>
                <Link className={'col-flex align-center bg-primary-black full-width no-text-decoration'} href='cart' >
                    <Image src='https://www.svgrepo.com/show/508283/cart.svg'
                        alt='logo'
                        width={100}
                        height={100} />
                </Link>

                <Image src='https://www.svgrepo.com/show/399049/woman-technologist-medium-light-skin-tone.svg'
                    alt='logo'
                    width={100}
                    height={100} />
            </Box>
        </header>

    );
}

export default observer(Header);